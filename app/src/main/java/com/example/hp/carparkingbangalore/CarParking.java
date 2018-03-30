package com.example.hp.carparkingbangalore;





        import android.database.Cursor;
        import android.graphics.Color;
        import android.support.v7.app.AlertDialog;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.support.v7.widget.LinearLayoutCompat;
        import android.text.style.AbsoluteSizeSpan;
        import android.view.View;
        import android.widget.AbsoluteLayout;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.LinearLayout;
        import android.widget.RelativeLayout;
        import android.widget.Toast;

public class CarParking extends AppCompatActivity {
    Database mydb;
    Button b1,b,b2,b3,b4,b5,b6,b7,b8,b9,b10,bd,bdl;
    AbsoluteLayout line;
    EditText editText,name,contact;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_parking);
        mydb = new Database(this);
        b1 = (Button) findViewById(R.id.button1);
        b = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);
        b10 = (Button) findViewById(R.id.button10);


        bd = (Button) findViewById(R.id.buttondisplay);
        bdl = (Button) findViewById(R.id.buttonclear);
        //here you cna change the color hstory button
        bd.setBackgroundColor(Color.YELLOW);

        //here you cna change the color clear button
        bdl.setBackgroundColor(getResources().getColor(R.color.reset));


        //here you cna change the color submit button
        b.setBackgroundColor(Color.CYAN);



        line = (AbsoluteLayout) findViewById(R.id.line);
        editText = (EditText) findViewById(R.id.text3);
        name = (EditText) findViewById(R.id.name);

        contact = (EditText) findViewById(R.id.contact);

        editText.setVisibility(View.GONE);
        name.setVisibility(View.GONE);

        contact.setVisibility(View.GONE);

        b.setVisibility(View.GONE);

        //sets all the slots to green
        setGreen();



        //slot1
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res=mydb.getData();
                while (res.moveToNext()) {
                    String g = res.getString(1);
                    if (g.equals("1")){
                        Toast.makeText(CarParking.this, "Slot is not empty", Toast.LENGTH_LONG).show();
                       // b.setVisibility(View.GONE);

                        return;
                    }
                }
                // b.setBackgroundColor(Color.BLUE);
                editText.setVisibility(View.VISIBLE);
                name.setVisibility(View.VISIBLE);
                contact.setVisibility(View.VISIBLE);


                b.setVisibility(View.VISIBLE);
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        boolean isInserted = mydb.insertData(1,editText.getText().toString(),name.getText().toString(),contact.getText().toString());

                        if (isInserted = true)

                            Toast.makeText(CarParking.this, "data inserted", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(CarParking.this, "data not inserted", Toast.LENGTH_LONG).show();
                        editText.setText("");
                        name.setText("");
                        contact.setText("");
                        //b1.setBackgroundColor(Color.RED);
                        b.setVisibility(View.GONE);
                        editText.setVisibility(View.GONE);
                        name.setVisibility(View.GONE);
                        contact.setVisibility(View.GONE);
                        view();

                    }
                });
            }
        });


        //slot2
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res=mydb.getData();
                while (res.moveToNext()) {
                    String g = res.getString(1);
                    if (g.equals("2")){
                        Toast.makeText(CarParking.this, "Slot is not empty", Toast.LENGTH_LONG).show();
                        // b.setVisibility(View.GONE);

                        return;
                    }
                }
                // b.setBackgroundColor(Color.BLUE);
                editText.setVisibility(View.VISIBLE);
                name.setVisibility(View.VISIBLE);
                contact.setVisibility(View.VISIBLE);
                b.setVisibility(View.VISIBLE);
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        boolean isInserted = mydb.insertData(2,editText.getText().toString(),name.getText().toString(),contact.getText().toString());


                        if (isInserted = true)

                            Toast.makeText(CarParking.this, "data inserted", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(CarParking.this, "data not inserted", Toast.LENGTH_LONG).show();
                        editText.setText("");
                        name.setText("");
                        contact.setText("");
                        //b1.setBackgroundColor(Color.RED);
                        b.setVisibility(View.GONE);
                        editText.setVisibility(View.GONE);
                        name.setVisibility(View.GONE);
                        contact.setVisibility(View.GONE);
                        view();

                    }
                });
            }
        });



        //slot3


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res=mydb.getData();
                while (res.moveToNext()) {
                    String g = res.getString(1);
                    if (g.equals("3")){
                        Toast.makeText(CarParking.this, "Slot is not empty", Toast.LENGTH_LONG).show();
                        // b.setVisibility(View.GONE);

                        return;
                    }
                }
                b.setVisibility(View.VISIBLE);

                // b.setBackgroundColor(Color.BLUE);
                editText.setVisibility(View.VISIBLE);
                name.setVisibility(View.VISIBLE);
                contact.setVisibility(View.VISIBLE);
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        boolean isInserted = mydb.insertData(3,editText.getText().toString(),name.getText().toString(),contact.getText().toString());


                        if (isInserted = true)

                            Toast.makeText(CarParking.this, "data inserted", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(CarParking.this, "data not inserted", Toast.LENGTH_LONG).show();
                        editText.setText("");
                        name.setText("");
                        contact.setText("");
                        //b1.setBackgroundColor(Color.RED);
                        name.setVisibility(View.GONE);
                        contact.setVisibility(View.GONE);
                        b.setVisibility(View.GONE);
                        editText.setVisibility(View.GONE);
                        view();

                    }
                });
            }
        });




        //slot 4



        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res=mydb.getData();
                while (res.moveToNext()) {
                    String g = res.getString(1);
                    if (g.equals("4")){
                        Toast.makeText(CarParking.this, "Slot is not empty", Toast.LENGTH_LONG).show();
                        // b.setVisibility(View.GONE);

                        return;
                    }
                }
                b.setVisibility(View.VISIBLE);
                // b.setBackgroundColor(Color.BLUE);
                editText.setVisibility(View.VISIBLE);
                name.setVisibility(View.VISIBLE);
                contact.setVisibility(View.VISIBLE);
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        boolean isInserted = mydb.insertData(4,editText.getText().toString(),name.getText().toString(),contact.getText().toString());


                        if (isInserted = true)

                            Toast.makeText(CarParking.this, "data inserted", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(CarParking.this, "data not inserted", Toast.LENGTH_LONG).show();
                        editText.setText("");
                        name.setText("");
                        contact.setText("");
                        name.setVisibility(View.GONE);
                        contact.setVisibility(View.GONE);                        //b1.setBackgroundColor(Color.RED);
                        b.setVisibility(View.GONE);
                        editText.setVisibility(View.GONE);
                        view();

                    }
                });
            }
        });


        //slot 5


        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res=mydb.getData();
                while (res.moveToNext()) {
                    String g = res.getString(1);
                    if (g.equals("5")){
                        Toast.makeText(CarParking.this, "Slot is not empty", Toast.LENGTH_LONG).show();
                        // b.setVisibility(View.GONE);

                        return;
                    }
                }
                b.setVisibility(View.VISIBLE);
                // b.setBackgroundColor(Color.BLUE);
                editText.setVisibility(View.VISIBLE);
                name.setVisibility(View.VISIBLE);
                contact.setVisibility(View.VISIBLE);
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        boolean isInserted = mydb.insertData(5,editText.getText().toString(),name.getText().toString(),contact.getText().toString());


                        if (isInserted = true)

                            Toast.makeText(CarParking.this, "data inserted", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(CarParking.this, "data not inserted", Toast.LENGTH_LONG).show();
                        editText.setText("");
                        name.setText("");
                        contact.setText("");
                        //b1.setBackgroundColor(Color.RED);
                        name.setVisibility(View.GONE);
                        contact.setVisibility(View.GONE);
                        b.setVisibility(View.GONE);
                        editText.setVisibility(View.GONE);
                        view();

                    }
                });
            }
        });



        //slot 6


        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res=mydb.getData();
                while (res.moveToNext()) {
                    String g = res.getString(1);
                    if (g.equals("6")){
                        Toast.makeText(CarParking.this, "Slot is not empty", Toast.LENGTH_LONG).show();
                        // b.setVisibility(View.GONE);

                        return;
                    }
                }
                b.setVisibility(View.VISIBLE);
                // b.setBackgroundColor(Color.BLUE);
                editText.setVisibility(View.VISIBLE);
                name.setVisibility(View.VISIBLE);
                contact.setVisibility(View.VISIBLE);
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        boolean isInserted = mydb.insertData(6,editText.getText().toString(),name.getText().toString(),contact.getText().toString());


                        if (isInserted = true)

                            Toast.makeText(CarParking.this, "data inserted", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(CarParking.this, "data not inserted", Toast.LENGTH_LONG).show();
                        editText.setText("");
                        name.setText("");
                        contact.setText("");
                        //b1.setBackgroundColor(Color.RED);
                        b.setVisibility(View.GONE);
                        editText.setVisibility(View.GONE);
                        name.setVisibility(View.GONE);
                        contact.setVisibility(View.GONE);
                        view();

                    }
                });
            }
        });
        //slot 7


        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res=mydb.getData();
                while (res.moveToNext()) {
                    String g = res.getString(1);
                    if (g.equals("7")){
                        Toast.makeText(CarParking.this, "Slot is not empty", Toast.LENGTH_LONG).show();
                        // b.setVisibility(View.GONE);

                        return;
                    }
                }
                b.setVisibility(View.VISIBLE);
                // b.setBackgroundColor(Color.BLUE);
                editText.setVisibility(View.VISIBLE);
                name.setVisibility(View.VISIBLE);
                contact.setVisibility(View.VISIBLE);
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        boolean isInserted = mydb.insertData(7,editText.getText().toString(),name.getText().toString(),contact.getText().toString());


                        if (isInserted = true)

                            Toast.makeText(CarParking.this, "data inserted", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(CarParking.this, "data not inserted", Toast.LENGTH_LONG).show();
                        editText.setText("");
                        name.setText("");
                        contact.setText("");
                        //b1.setBackgroundColor(Color.RED);
                        b.setVisibility(View.GONE);
                        name.setVisibility(View.GONE);
                        contact.setVisibility(View.GONE);
                        editText.setVisibility(View.GONE);
                        view();

                    }
                });
            }
        });
        //slot8


        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // b.setBackgroundColor(Color.BLUE);
                Cursor res=mydb.getData();
                while (res.moveToNext()) {
                    String g = res.getString(1);
                    if (g.equals("8")){
                        Toast.makeText(CarParking.this, "Slot is not empty", Toast.LENGTH_LONG).show();
                        // b.setVisibility(View.GONE);

                        return;
                    }
                }
                b.setVisibility(View.VISIBLE);

                // b.setBackgroundColor(Color.BLUE);
                editText.setVisibility(View.VISIBLE);
                name.setVisibility(View.VISIBLE);
                contact.setVisibility(View.VISIBLE);
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        boolean isInserted = mydb.insertData(8,editText.getText().toString(),name.getText().toString(),contact.getText().toString());


                        if (isInserted = true)

                            Toast.makeText(CarParking.this, "data inserted", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(CarParking.this, "data not inserted", Toast.LENGTH_LONG).show();
                        editText.setText("");
                        name.setText("");
                        contact.setText("");
                        //b1.setBackgroundColor(Color.RED);
                        name.setVisibility(View.GONE);
                        contact.setVisibility(View.GONE);
                        b.setVisibility(View.GONE);
                        editText.setVisibility(View.GONE);
                        view();

                    }
                });
            }
        });
        //slot 9


        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // b.setBackgroundColor(Color.BLUE);
                Cursor res=mydb.getData();
                while (res.moveToNext()) {
                    String g = res.getString(1);
                    if (g.equals("9")){
                        Toast.makeText(CarParking.this, "Slot is not empty", Toast.LENGTH_LONG).show();
                        // b.setVisibility(View.GONE);

                        return;
                    }
                }

                b.setVisibility(View.VISIBLE);
                // b.setBackgroundColor(Color.BLUE);
                editText.setVisibility(View.VISIBLE);
                name.setVisibility(View.VISIBLE);
                contact.setVisibility(View.VISIBLE);
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        boolean isInserted = mydb.insertData(9,editText.getText().toString(),name.getText().toString(),contact.getText().toString());


                        if (isInserted = true)

                            Toast.makeText(CarParking.this, "data inserted", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(CarParking.this, "data not inserted", Toast.LENGTH_LONG).show();
                        editText.setText("");
                        name.setText("");
                        contact.setText("");
                        //b1.setBackgroundColor(Color.RED);
                        name.setVisibility(View.GONE);
                        contact.setVisibility(View.GONE);
                        b.setVisibility(View.GONE);
                        editText.setVisibility(View.GONE);
                        view();

                    }
                });
            }
        });
        //slot 10


        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // b.setBackgroundColor(Color.BLUE);
                Cursor res=mydb.getData();
                while (res.moveToNext()) {
                    String g = res.getString(1);
                    if (g.equals("10")){
                        Toast.makeText(CarParking.this, "Slot is not empty", Toast.LENGTH_LONG).show();
                        // b.setVisibility(View.GONE);

                        return;
                    }
                }
                b.setVisibility(View.VISIBLE);
                // b.setBackgroundColor(Color.BLUE);
                editText.setVisibility(View.VISIBLE);
                name.setVisibility(View.VISIBLE);
                contact.setVisibility(View.VISIBLE);
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        boolean isInserted = mydb.insertData(10,editText.getText().toString(),name.getText().toString(),contact.getText().toString());


                        if (isInserted = true)

                            Toast.makeText(CarParking.this, "data inserted", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(CarParking.this, "data not inserted", Toast.LENGTH_LONG).show();
                        editText.setText("");
                        name.setText("");
                        contact.setText("");
                        //b1.setBackgroundColor(Color.RED);
                        name.setVisibility(View.GONE);
                        contact.setVisibility(View.GONE);
                        b.setVisibility(View.GONE);
                        editText.setVisibility(View.GONE);
                        view();

                    }
                });
            }
        });


        view();
        viewAll();
        deleteall();
    }


    //reset all the slots to green and empty the history
    public void deleteall() {
        bdl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mydb.delete();
                setGreen();
            }
        });
    }
    public void setGreen(){
        b1.setBackgroundColor(getResources().getColor(R.color.greeen));
        b2.setBackgroundColor(getResources().getColor(R.color.greeen));
        b3.setBackgroundColor(getResources().getColor(R.color.greeen));
        b4.setBackgroundColor(getResources().getColor(R.color.greeen));
        b5.setBackgroundColor(getResources().getColor(R.color.greeen));
        b6.setBackgroundColor(getResources().getColor(R.color.greeen));

        b7.setBackgroundColor(getResources().getColor(R.color.greeen));
        b8.setBackgroundColor(getResources().getColor(R.color.greeen));
        b9.setBackgroundColor(getResources().getColor(R.color.greeen));
        b10.setBackgroundColor(getResources().getColor(R.color.greeen));
    }
    public void viewAll(){

        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res=mydb.getData();
                if(res.getCount() == 0){
                    show("data","none has booked the slot");
                    return;
                }
                StringBuffer sb=new StringBuffer();
                while (res.moveToNext()){

                    sb.append("SLOT_NO:"+res.getString(1)+"\n");
                    sb.append("CAR_NO:"+res.getString(2)+"\n");
                    sb.append("USER_NAME:"+res.getString(3)+"\n");
                    sb.append("CONTACT_NO:"+res.getString(4)+"\n");
                    sb.append("----------------------------\n\n");


                }
                show("data",sb.toString());


            }
        });
    }
    public void show(String title,String name){
        AlertDialog.Builder bd=new AlertDialog.Builder(this);
        bd.setCancelable(true);
        bd.setTitle(title);
        bd.setMessage(name);
        bd.show();


    }

    //display slots in red color which are booked
    public void view(){
        Cursor res=mydb.getData();
        while (res.moveToNext()) {
            String G = res.getString(1);

            switch (G) {
                case "1":
                    b1.setBackgroundColor(getResources().getColor(R.color.reed));
                    break;
                case "2":
                    b2.setBackgroundColor(getResources().getColor(R.color.reed));
                    break;
                case "3":
                    b3.setBackgroundColor(getResources().getColor(R.color.reed));
                    break;
                case "4":
                    b4.setBackgroundColor(getResources().getColor(R.color.reed));
                    break;
                case "5":
                    b5.setBackgroundColor(getResources().getColor(R.color.reed));
                    break;
                case "6":
                    b6.setBackgroundColor(getResources().getColor(R.color.reed));
                    break;
                case "7":
                    b7.setBackgroundColor(getResources().getColor(R.color.reed));
                    break;
                case "8":
                    b8.setBackgroundColor(getResources().getColor(R.color.reed));
                    break;
                case "9":
                    b9.setBackgroundColor(getResources().getColor(R.color.reed));
                    break;
                case "10":
                    b10.setBackgroundColor(getResources().getColor(R.color.reed));
                    break;

            }

        }
    }
}

