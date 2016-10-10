package cnife.feicui.bufferknife;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @Bind(R.id.tv1)
    Button tv1;
    @Bind(R.id.tv2)
    Button tv2;
    @Bind(R.id.tv3)
    Button tv3;
    @Bind(R.id.tv4)
    Button tv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       ButterKnife.bind(this);
    }



    @OnClick({R.id.tv1, R.id.tv2, R.id.tv3, R.id.tv4})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv1:
                Intent intent1 = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent1);
                break;
            case R.id.tv2:
                Intent intent2 = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent2);
                break;
            case R.id.tv3:
                Intent intent3 = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent3);
                break;
            case R.id.tv4:
                Intent intent4 = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent4);
                break;
        }
    }

}
