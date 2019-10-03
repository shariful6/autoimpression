package shariful.example.com.autoimpresion;

import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import static android.widget.LinearLayout.VERTICAL;

public class MainActivity extends AppCompatActivity {

    private AdView madView,madView2,madView3,madView4,madView5;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this,"ca-app-pub-7763861230157000~7181834336");//app Id

        madView=new AdView(this);
        madView.setAdSize(AdSize.SMART_BANNER);
        madView.setAdUnitId(getString(R.string.BANNERID));

        madView2=new AdView(this);
        madView2.setAdSize(AdSize.SMART_BANNER);
        madView2.setAdUnitId(getString(R.string.BANNERID));

        madView3=new AdView(this);
        madView3.setAdSize(AdSize.SMART_BANNER);
        madView3.setAdUnitId(getString(R.string.BANNERID));

        madView4=new AdView(this);
        madView4.setAdSize(AdSize.SMART_BANNER);
        madView4.setAdUnitId(getString(R.string.BANNERID));

        madView5=new AdView(this);
        madView5.setAdSize(AdSize.SMART_BANNER);
        madView5.setAdUnitId(getString(R.string.BANNERID));

        LinearLayout layout=new LinearLayout(this);
        layout.setOrientation(VERTICAL);
        layout.setBackgroundColor(Color.parseColor("#303F9F"));

        layout.addView(madView);
        layout.addView(madView2);
        layout.addView(madView3);
        layout.addView(madView4);
        layout.addView(madView5);

        AdRequest.Builder ad = new AdRequest.Builder();

        madView.loadAd(ad.build());
        madView2.loadAd(ad.build());
        madView3.loadAd(ad.build());
        madView4.loadAd(ad.build());
        madView5.loadAd(ad.build());

        setContentView(layout);
        Integer banner =Integer.valueOf(0);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                MainActivity.this.startActivity(intent);
                  MainActivity.this.finish();



            }
        },(long)(Integer.valueOf(20).intValue()*1000));







    }
}
