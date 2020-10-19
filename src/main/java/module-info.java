/*module MyPkg.CH_14.AExecuter {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;

    opens MyPkg.CH_14.AExecuter to javafx.fxml;
    exports MyPkg.CH_14.AExecuter;
}*/


module MyPkg.CH_31.JavFX_FXML {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;

    opens MyPkg.CH_31.JavaFX_FXML to javafx.fxml;
    exports MyPkg.CH_31.JavaFX_FXML;
}