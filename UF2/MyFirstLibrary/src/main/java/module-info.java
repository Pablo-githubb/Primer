module com.iesebrepablo.library20242024.myfirstlibrary {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.iesebrepablo.library20242024.myfirstlibrary to javafx.fxml;
    exports com.iesebrepablo.library20242024.myfirstlibrary;
}