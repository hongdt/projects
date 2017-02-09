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
    class ElementText2D : Microsoft.Xna.Framework.DrawableGameComponent
    {
        protected Vector2 pos;
        protected SpriteBatch monSpriteBatch;
        protected SpriteFont font;
        protected String text;
        public ElementText2D(Game game, String text)
            : base(game)
        {
            this.text = text;
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
            font = Game.Content.Load<SpriteFont>("SpriteFont1");
            pos = new Vector2(GraphicsDevice.Viewport.Width / 2, GraphicsDevice.Viewport.Height - 580);
            base.LoadContent();
        }
        public override void Update(GameTime gameTime)
        {
            // TODO: Add your update code here
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
