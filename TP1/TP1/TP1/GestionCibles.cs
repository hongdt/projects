using System;
using System.Collections.Generic;
using System.Linq;
using Microsoft.Xna.Framework;
using Microsoft.Xna.Framework.Audio;
using Microsoft.Xna.Framework.Content;
using Microsoft.Xna.Framework.GamerServices;
using Microsoft.Xna.Framework.Graphics;
using Microsoft.Xna.Framework.Input;
using Microsoft.Xna.Framework.Media;

namespace TP1
{
    public class GestionCibles : Microsoft.Xna.Framework.GameComponent
    {
        int niveauCourant;
        List<Cible> cibles;
        int nombreCible;
        Game1 game;
        public GestionCibles(Game game):base(game)
        {
            niveauCourant = 1;
            nombreCible = 0;
            cibles = new List<Cible>();
            this.game = (Game1)game;
        }

        public List<Cible> Cibles
        {
            get { return cibles; }
        }


        public override void Update(GameTime gameTime)
        {
            nombreCible = this.niveauCourant * 1;

            for (int i = 0; i < cibles.Count; i++)
            {
                Rectangle R1 = cibles.ElementAt(i).getBound();
                Rectangle R2 = new Rectangle(0, 0, 800, 600);
                if (!R2.Contains(R1))
                {
                    game.Components.Remove(cibles.ElementAt(i));
                    cibles.ElementAt(i).Remove();
                    cibles.RemoveAt(i);
                }
            }

            if (cibles.Count < nombreCible)
            {
                Vector2 depart, destination;
                Random R = new Random();
                depart.X = R.Next(0, 801);
                depart.Y = 0;
                destination.X = R.Next(0, 801);
                destination.Y = 600;
                Cible myCible = new Cible(game, "yellow-star", depart, destination);
                myCible.DrawOrder = 0;
                cibles.Add(myCible);
                game.Components.Add(myCible);
            }
            
            base.Update(gameTime);
        }

        public void incLevel()
        {
            niveauCourant++;
        }
    }
}
