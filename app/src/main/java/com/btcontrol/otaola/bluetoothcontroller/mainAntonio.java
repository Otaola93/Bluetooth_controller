
package com.btcontrol.otaola.bluetoothcontroller;

import android . content . Intent;
import android . os . Bundle;
import android . support . v7 . app . ActionBarActivity;
import android . view . View;
import android . widget . TextView;

/* Activity principal… */
/*public class mainAntonio extends ActionBarActivity implements View . OnClickListener {
    private BluetoothManager mBluetoothManager;
    private TextView mText;
    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView ( R . layout . activity_main );
        this.findViewById(R.id.man). setOnClickListener ( this );
        this.findViewById(R.id.auto). setOnClickListener ( this );
    }
    @Override
    public void onClick ( View view ) {
        Intent i = null;
        switch ( view . getId ()) {
            case R . id . man:
                i = new Intent ( this , Manual . class );
                break;
            case R . id . auto:
                i = new Intent ( this , Auto . class );
                break;
        }
        if(i!=null) {
            this.startActivity(i);
        }
    }
}*/