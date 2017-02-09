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
    public class Element2D : Microsoft.Xna.Framework.DrawableGameComponent
    {
        protected Vector2 pos;
        protected Texture2D myTexture;
        protected SpriteBatch monSpriteBatch;
        protected String texture;
        public Element2D(Game game, String texture)
            : base(game)
        {
            this.texture = texture;
        }


        /// <summary>
        /// Allows the game component to perform any initialization it needs to before starting
        /// to run.  This is where it can query for any required services and load content.
        /// </summary>
        public override void Initialize()
        {
            // TODO: Add your initialization code here

            base.Initialize();

        }

        /// <summary>
        /// Allows the game component to update itself.
        /// </summary>
        /// <param name="gameTime">Provides a snapshot of timing values.</param>
        /// 
        protected override void LoadContent()
        {
            monSpriteBatch = new SpriteBatch(this.Game.GraphicsDevice);
            myTexture = this.Game.Content.Load<Texture2D>(texture);
            base.LoadContent();
        }

        public Rectangle getBound()
        {
            return new Rectangle((int)pos.X, (int)pos.Y, myTexture.Width, myTexture.Height);
        }
        public bool isCollides(Element2D s)
        {
            return getBound().Intersects(s.getBound());
        }
        public virtual void Remove()
        {
            //pos = -100 * Vector2.One;
            //Visible = false;
            Enabled = false;
            Dispose(true);
        }

        public override void Update(GameTime gameTime)
        {
            // TODO: Add your update code here
            base.Update(gameTime);
        }

        public override void Draw(GameTime gameTime)
        {
            monSpriteBatch.Begin(SpriteSortMode.BackToFront, BlendState.AlphaBlend);
            monSpriteBatch.Draw(myTexture, pos, Color.White);
            monSpriteBatch.End();
            base.Draw(gameTime);

        }
    }
}
