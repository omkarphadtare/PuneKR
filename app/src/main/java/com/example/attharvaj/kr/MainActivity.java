package com.example.attharvaj.kr;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.navigation.NavigationView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Gravity;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton transport = (ImageButton)findViewById(R.id.imageButton_transport);

        transport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DrawerLayout navDrawer = findViewById(R.id.drawer_layout);
                // If the navigation drawer is not open then open it, if its already open then close it.
                /*if(!navDrawer.isDrawerOpen(GravityCompat.START)) navDrawer.openDrawer(Gravity.LEFT);
                else navDrawer.closeDrawer(Gravity.RIGHT);*/
                    // Handle the camera action
                    Intent i = new Intent(MainActivity.this, Transport.class);
                    startActivity(i);
            }

        });

        ImageButton restaurants = (ImageButton)findViewById(R.id.imageButton_restaurants);

        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DrawerLayout navDrawer = findViewById(R.id.drawer_layout);
                // If the navigation drawer is not open then open it, if its already open then close it.
                /*if(!navDrawer.isDrawerOpen(GravityCompat.START)) navDrawer.openDrawer(Gravity.LEFT);
                else navDrawer.closeDrawer(Gravity.RIGHT);*/
                // Handle the camera action
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=Restaurants");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }

        });


        ImageButton outskirts = (ImageButton)findViewById(R.id.imageButton_outskirts);

        outskirts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DrawerLayout navDrawer = findViewById(R.id.drawer_layout);
                // If the navigation drawer is not open then open it, if its already open then close it.
                /*if(!navDrawer.isDrawerOpen(GravityCompat.START)) navDrawer.openDrawer(Gravity.LEFT);
                else navDrawer.closeDrawer(Gravity.RIGHT);*/
                // Handle the camera action
                Intent i = new Intent(MainActivity.this, Outskirts.class);
                startActivity(i);
            }

        });

        ImageButton police = (ImageButton)findViewById(R.id.imageButton_police_stn);

        police.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DrawerLayout navDrawer = findViewById(R.id.drawer_layout);
                // If the navigation drawer is not open then open it, if its already open then close it.
                /*if(!navDrawer.isDrawerOpen(GravityCompat.START)) navDrawer.openDrawer(Gravity.LEFT);
                else navDrawer.closeDrawer(Gravity.RIGHT);*/
                // Handle the camera action
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=Police Station");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }

        });

        ImageButton petrolPumps = (ImageButton)findViewById(R.id.imageButton_petrolPumps);

        petrolPumps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DrawerLayout navDrawer = findViewById(R.id.drawer_layout);
                // If the navigation drawer is not open then open it, if its already open then close it.
               /* if(!navDrawer.isDrawerOpen(GravityCompat.START)) navDrawer.openDrawer(Gravity.LEFT);
                else navDrawer.closeDrawer(Gravity.RIGHT);*/
                // Handle the camera action
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=Petrol pumps");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }

        });


        ImageButton mechanic = (ImageButton)findViewById(R.id.imageButton_garage);

        mechanic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DrawerLayout navDrawer = findViewById(R.id.drawer_layout);
                // If the navigation drawer is not open then open it, if its already open then close it.
                //if(!navDrawer.isDrawerOpen(GravityCompat.START)) navDrawer.openDrawer(Gravity.LEFT);
                //else navDrawer.closeDrawer(Gravity.RIGHT);
                // Handle the camera action
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=mechanics");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }

        });



        ImageButton touristPlaces = (ImageButton)findViewById(R.id.imageButton_touristPlaces);

        touristPlaces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DrawerLayout navDrawer = findViewById(R.id.drawer_layout);
                // If the navigation drawer is not open then open it, if its already open then close it.
                //if(!navDrawer.isDrawerOpen(GravityCompat.START)) navDrawer.openDrawer(Gravity.LEFT);
                //else navDrawer.closeDrawer(Gravity.RIGHT);
                // Handle the camera action
                Intent i = new Intent(MainActivity.this, tourist.class);
                startActivity(i);

            }

        });



        ImageButton hospitals = (ImageButton)findViewById(R.id.imageButton_hospitals);

        hospitals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DrawerLayout navDrawer = findViewById(R.id.drawer_layout);
                // If the navigation drawer is not open then open it, if its already open then close it.
                //if(!navDrawer.isDrawerOpen(GravityCompat.START)) navDrawer.openDrawer(Gravity.LEFT);
                //else navDrawer.closeDrawer(Gravity.RIGHT);
                // Handle the camera action
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=Hospitals");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }

        });



        ImageButton accomodations = (ImageButton)findViewById(R.id.imageButton_accomodation);

        accomodations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DrawerLayout navDrawer = findViewById(R.id.drawer_layout);
                // If the navigation drawer is not open then open it, if its already open then close it.
                //if(!navDrawer.isDrawerOpen(GravityCompat.START)) navDrawer.openDrawer(Gravity.LEFT);
                //else navDrawer.closeDrawer(Gravity.RIGHT);
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=Accomodation");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }

        });





        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.transport) {
            // Handle the camera action
            Intent i = new Intent(MainActivity.this, Transport.class);
            startActivity(i);
        } else if (id == R.id.accomodation) {
            Uri gmmIntentUri = Uri.parse("geo:0,0?q=Accomodation near me");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);

        } else if (id == R.id.restaurants) {
            Uri gmmIntentUri = Uri.parse("geo:0,0?q=Restaurants");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);

        } else if (id == R.id.tourist) {
            Intent i = new Intent(MainActivity.this, tourist.class);
           startActivity(i);

        } else if (id == R.id.outskirts) {
            Intent i = new Intent(MainActivity.this, Outskirts.class);
            startActivity(i);

        } else if (id == R.id.petrol) {
            Uri gmmIntentUri = Uri.parse("geo:0,0?q=Petrol pumps near me");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);

        }else if (id == R.id.garage) {
            Uri gmmIntentUri = Uri.parse("geo:0,0?q=Garages near me");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);

        }else if (id == R.id.hospitals) {

            Uri gmmIntentUri = Uri.parse("geo:0,0?q=Hospitals near me");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);

        } else if (id == R.id.police) {
            Uri gmmIntentUri = Uri.parse("geo:0,0?q=Police Station");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);

        }else if (id == R.id.share) {
            PackageManager pm = getPackageManager();
            try {
                pm.getPackageInfo("com.ubercab", PackageManager.GET_ACTIVITIES);
                String uri = "uber://?action=setPickup&pickup=my_location";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(uri));
                startActivity(intent);
            } catch (PackageManager.NameNotFoundException e) {
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.ubercab")));
                } catch (android.content.ActivityNotFoundException anfe) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=com.ubercab")));
                }
            }

        } else if (id == R.id.contact) {

        }else if (id == R.id.about) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
