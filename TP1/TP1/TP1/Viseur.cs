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
    /// <summary>
    /// This is a game component that implements IUpdateable.
    /// </summary>
    public class Viseur : Element2D
    {
        public Viseur(Game game, String texture):base(game, texture)
        {

        }
        public override void Update(GameTime gameTime)
        {
            // TODO: Add your update code here

            MouseState mouseState = Mouse.GetState();
            pos.X = mouseState.X - myTexture.Width / 2;
            pos.Y = mouseState.Y - myTexture.Height / 2;

            base.Update(gameTime);
        }
    }
}