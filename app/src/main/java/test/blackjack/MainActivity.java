package test.blackjack;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
       // actionBar.setDisplayOptions(0);
        actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_TITLE, ActionBar.DISPLAY_USE_LOGO);
        actionBar.setIcon(R.mipmap.icon1);
       actionBar.setTitle("  Black Jack");
    //    ImageView view = (ImageView) findViewById(android.R.id.icon);
    //   view.setPadding(7,0,7,0);
       // actionBar.setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        ImageView imageView = (ImageView) findViewById(R.id.background_image);
        switch(id){
            case R.id.backgrnd :
                DialogForBackground dialogbk = new DialogForBackground();
                dialogbk.show(getSupportFragmentManager(), "custom");
                return true;
            case R.id.faq_game:
                CustomDialogFragment dialogfq = new CustomDialogFragment();
                dialogfq.show(getSupportFragmentManager(), "custom");
                return true;
            case R.id.exit_program:
                this.finish();
                return true;
         }
        return super.onOptionsItemSelected(item);

    }
    public void click_rebet_deal_hit(View view) {

    }
}
