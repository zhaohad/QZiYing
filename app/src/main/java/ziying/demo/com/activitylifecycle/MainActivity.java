package ziying.demo.com.activitylifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import ziying.demo.com.test.*;

public class MainActivity extends Activity {
    private static MainActivity sIntance;
    private static final String TAG = "MainActivity";
    private static final int MSG_START = 1;
    private Button mBtnJump;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "onCreate");
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mBtnJump = (Button) findViewById(R.id.btn_jump);
        mBtnJump.setOnClickListener(mClickListener);
    }

    private View.OnClickListener mClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_jump:
                    Intent intent = new Intent(MainActivity.this, ZiYingDaHuaiDanActivity.class);
                    MainActivity.this.startActivity(intent);
                    break;
            }
        }
    };

    @Override
    protected void onResume() {
        super.onResume( );
        Log.e("TAG", "onResume");
        TestMerge.testMerge1();
        TestErase.testErase1();
    }

    @Override
    protected void onPause() {
        super.onPause();
//        Log.e("TAG", "onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        Log.e("TAG", "onDestroy");
    }

    @Override
    protected void onStart() {
        super.onStart();
//        Log.e("TAG", "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
//        Log.e("TAG", "onStop");
    }
}
