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
    public class Cible : Movable
    {
        Vector2 depart;
        Vector2 destination;
        public Cible(Game game, String texture, Vector2 depart, Vector2 destination):base(game, texture)
        {
            this.depart = depart;
            this.destination = destination;
            this.setTrajectory();
        }
        public override void Update(GameTime gameTime)
        {
            base.Update(gameTime);
        }
        public override void setTrajectory()
        {
            float x_start, y_start;
            float x_end, y_end;

            float col, row;

            float dx, dy;

            float sin_line, cos_line;

            float length;

            x_start = depart.X;
            y_start = depart.Y;

            x_end = destination.X;
            y_end = destination.Y;

            dx = x_end - x_start;
            dy = y_end - y_start;

            //Calculer le long de la ligne
            length = (float)Math.Sqrt(dx * dx + dy * dy);

            sin_line = dy / length;
            cos_line = dx / length;

            col = x_start;
            row = y_start;

            for (int i = 1; i < length; i++)
            {
                setOfPoints.Add(new Vector2(col, row));

                row = y_start + sin_line;
                col = x_start + cos_line;

                y_start = row;
                x_start = col;
            }
        }
    }
}
