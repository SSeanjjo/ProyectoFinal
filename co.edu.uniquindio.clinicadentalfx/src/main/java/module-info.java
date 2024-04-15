module co.edu.uniquindio.clinicadental.clinicadentalapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.clinicadental.clinicadentalapp to javafx.fxml;
    exports co.edu.uniquindio.clinicadental.clinicadentalapp;

    opens co.edu.uniquindio.clinicadental.clinicadentalapp.Viewcontroller;
    exports co.edu.uniquindio.clinicadental.clinicadentalapp.Viewcontroller;

    opens  co.edu.uniquindio.clinicadental.clinicadentalapp.Controller;
    exports co.edu.uniquindio.clinicadental.clinicadentalapp.Controller;
}