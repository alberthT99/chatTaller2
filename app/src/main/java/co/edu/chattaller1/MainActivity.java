package co.edu.chattaller1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView chatWindow;
    private EditText inputUser1;
    private EditText inputUser2;
    private Button sendUser1;
    private Button sendUser2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Enlazando los elementos de la interfaz con el código
        chatWindow = findViewById(R.id.chatWindow);
        inputUser1 = findViewById(R.id.inputUser1);
        inputUser2 = findViewById(R.id.inputUser2);
        sendUser1 = findViewById(R.id.sendUser1);
        sendUser2 = findViewById(R.id.sendUser2);

        // Botón para el Usuario 1
        sendUser1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = inputUser1.getText().toString();
                if (!message.isEmpty()) {
                    chatWindow.append("\nSebastian: " + message);
                    inputUser1.setText(""); // Limpiar el campo de texto
                }
            }
        });

        // Botón para el Usuario 2
        sendUser2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = inputUser2.getText().toString();
                if (!message.isEmpty()) {
                    chatWindow.append("\nAlberth: " + message);
                    inputUser2.setText(""); // Limpiar el campo de texto
                }
            }
        });
    }
}