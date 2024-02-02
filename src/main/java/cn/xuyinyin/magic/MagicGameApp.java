package cn.xuyinyin.magic;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.dsl.FXGL;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * @author : XuJiaWei
 * @since : 2024-02-02 10:06
 */
public class MagicGameApp  extends GameApplication {

    @Override
    protected void initSettings(GameSettings settings) {
        settings.setWidth(800);
        settings.setHeight(600);
        settings.setTitle("BasicGameSample");
    }

    @Override
    protected void initGame() {
        FXGL.entityBuilder()
                .at(150, 150)
                .view(new Rectangle(40, 40, Color.BLUE))
                .buildAndAttach();
    }

    public static void main(String[] args) {
        launch(args);
    }
}