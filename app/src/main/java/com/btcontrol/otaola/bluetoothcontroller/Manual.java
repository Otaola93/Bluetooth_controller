package com.btcontrol.otaola.bluetoothcontroller;

import android . os . Bundle ;
import android . support . v7 . app . ActionBarActivity ;
import android . view . MotionEvent ;
import android . view . View ;

import java . io . IOException ;
/* Activity para la gestión manual del vehículo… */
/*public class Manual extends ActionBarActivity implements BluetoothManager. BluetoothReceiver , View . OnTouchListener {
    private BluetoothManager mBluetoothManager ;
    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super . onCreate ( savedInstanceState );
        setContentView ( R . layout . activity_man );
        try {
            mBluetoothManager = new BluetoothManager ( this );
            mBluetoothManager . setMessageListener ( this );
        } catch ( Exception e ) {
            e . printStackTrace ();
        }
        this . findViewById ( R . id . man_adelante ). setOnTouchListener ( this );
        this . findViewById ( R . id . man_atras ). setOnTouchListener ( this );
        this . findViewById ( R . id . man_derecha ). setOnTouchListener ( this );
        this . findViewById ( R . id . man_izquierda ). setOnTouchListener ( this );
        this . findViewById ( R . id . man_izquierda ). getRootView (). setOnTouchListener ( this );
    }
    @Override
    public void onResume () {
        super . onResume ();
        try {
            mBluetoothManager . resume ();
            mBluetoothManager . send ( "M" );
        } catch ( IOException e ) {
            e . printStackTrace ();
        }
    }
    @Override
    public void onPause () {
        super . onPause ();
        try {
            mBluetoothManager . pause ();
        } catch ( IOException e ) {
            e . printStackTrace ();
        }
    }
    @Override
    public void onBluetoothReceive ( String msg ) {
    }
    @Override
    public boolean onTouch ( View view , MotionEvent motionEvent ) {
        StringBuilder msg = new StringBuilder ();
        switch ( view . getId ()) {
            case R . id . man_adelante :
                msg . append ( 'F' );
                break ;
            case R . id . man_atras :
                msg . append ( 'B' );
                break ;
            case R . id . man_derecha :
                msg . append ( 'R' );
                break ;
            case R . id . man_izquierda :
                msg . append ( 'L' );
                break ;
        }
        if ( motionEvent . getAction () == MotionEvent . ACTION_DOWN && msg . length () != 0 ) {
            msg . append ( 'E' );
        } else if ( motionEvent . getAction () == MotionEvent . ACTION_UP ) {
            msg . append ( 'D' );
        }
        try {
            mBluetoothManager . send ( msg . toString ());
        } catch ( IOException e ) {
            e . printStackTrace ();
        }
        return true ;
    }
}*/