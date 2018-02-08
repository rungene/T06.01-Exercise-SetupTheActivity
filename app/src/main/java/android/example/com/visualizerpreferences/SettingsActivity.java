package android.example.com.visualizerpreferences;

import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        ActionBar actionBar = this.getSupportActionBar();

        //set the action bar back button to look like an up button

        if (actionBar !=null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }


    }
/*    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //use AppCompatActivity's method getMenuInflater to get a handle on the menu inflater
        MenuInflater inflater = getMenuInflater();
        //use the inflater's inflate method to inflate our menu layout to this menu
        inflater.inflate(R.menu.visualizer_menu,menu);
        //return true so that the menu is displayed in the toolbar
        return true;
    }*/

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        //When the home buttons pressed ,take the user back to the VisualizerActivity

        if (id==R.id.home) {
            NavUtils.navigateUpFromSameTask(this);
        }
        return super.onOptionsItemSelected(item);
    }
}
