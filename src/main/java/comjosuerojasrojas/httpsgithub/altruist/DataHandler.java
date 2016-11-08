package comjosuerojasrojas.httpsgithub.altruist;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;

/**
 * this class has become where every data gets handle for changing of activities
 * Created by josuerojas on 11/5/16.
 */
public class DataHandler{

    static String data;
    static String[] paragraph;
    static Bitmap profileSubmit;

    public DataHandler(String data){
        this.data = data;
        Log.d("dataHandler",data);
        for(String person:TextUtils.split(data,"/n")){
            Log.d("people",person);
        }
        paragraph = TextUtils.split(data,"/n");

    }

    public static String[] getPerson(int id){
       // for(String person:TextUtils.split(paragraph[id],";")){
         //   Log.d("people",person);
      //  }
        return TextUtils.split(paragraph[id],";");
    }


    public static String[] getNeeds(int personID){
        for(String needs: TextUtils.split((getPerson(personID))[0],"/p")){
            Log.d("needs",needs);
        }
        return TextUtils.split((getPerson(personID))[0],"/p");
    }

    public static String getName(int personID){
        return getPerson(personID)[2];
    }


    public static void postPerson(String newPerson){
        data =data + newPerson;
        MainActivity.dataView.setText(data);

    }






}
