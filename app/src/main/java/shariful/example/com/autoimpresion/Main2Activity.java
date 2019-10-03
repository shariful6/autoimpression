package shariful.example.com.autoimpresion;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class Main2Activity extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Integer interstitial =Integer.valueOf(0);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Main2Activity.this,MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                Main2Activity.this.startActivity(intent);
                Main2Activity.this.finish();




            }
        },(long)(Integer.valueOf(20).intValue()*1000));
          mInterstitialAd =new InterstitialAd(this);
        mInterstitialAd.setAdUnitId(getString(R.string.INTERSTATIALID));
        AdRequest.Builder ad = new AdRequest.Builder();
        mInterstitialAd.loadAd(ad.build());

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
              Main2Activity.this.displayInterstitial();
            }

        });


    }

    private void displayInterstitial() {

        if(mInterstitialAd.isLoaded())
        {
            mInterstitialAd.show();
        }
        else
        {
            Toast.makeText(this, "Failed lo LoadAd !!", Toast.LENGTH_SHORT).show();
        }
    }
}
