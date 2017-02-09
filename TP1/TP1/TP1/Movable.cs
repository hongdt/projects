using System;
using System.Collections.Generic;
using System.Collections;
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
    public class Movable : Element2D
    {
        protected List<Vector2> setOfPoints;
        int index;
        public Movable(Game game, String texture):base(game, texture)
        {
            index = 0;
            setOfPoints = new List<Vector2>();
        }
        public override void Update(GameTime gameTime)
        {
            if(index < setOfPoints.Count)
            {
                pos.X = setOfPoints.ElementAt(index).X;
                pos.Y = setOfPoints.ElementAt(index).Y;
                index++;
            }
            base.Update(gameTime);
        }
        public virtual void setTrajectory()
        { 
            
        }
    }
}
