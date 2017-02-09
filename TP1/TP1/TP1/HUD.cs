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
    class HUD : ElementText2D
    {
        public int score;
        Game1 game;
        public String text;
        public HUD(Game game, String text)
            : base(game, text)
        {
            this.game = (Game1)game;
            this.score = 0;
            this.text = text;
        }
        public override void Update(GameTime gameTime)
        {
            Viseur viseur = game.myViseur;
            GestionCibles gestionCibles = game.gestionCibles;
            List<Cible> cibles = gestionCibles.Cibles;
            for (int i = 0; i < cibles.Count; i++)
            {
                MouseState mouseState = Mouse.GetState();
                if (viseur.isCollides(cibles.ElementAt(i)) && cibles.ElementAt(i).Enabled && mouseState.LeftButton == ButtonState.Pressed)
                {
                    cibles.ElementAt(i).Remove();
                    cibles.RemoveAt(i);
                    //cibles.ElementAt(i).MyTexture = cibles.ElementAt(i).Game.Content.Load<Texture2D>("red-star");
                    this.score += 100;
                    this.text = "Socre : " + score;
                }
            }
            base.Update(gameTime);
        }

        public override void Draw(GameTime gameTime)
        {
            monSpriteBatch.Begin(SpriteSortMode.BackToFront, BlendState.AlphaBlend);
            Vector2 fontOrigin = font.MeasureString(text) / 2;
            monSpriteBatch.DrawString(font, text, pos, Color.AntiqueWhite, 0, fontOrigin, 1.0f, SpriteEffects.None, 0.5f);
            monSpriteBatch.End();
            base.Draw(gameTime);
        }
    }
}
