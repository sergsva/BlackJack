package test.blackjack;
import android.content.DialogInterface;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.ImageView;


/**
 * Created by Administrator on 30.08.2017.
 */

public class DialogForBackground  extends DialogFragment{
    @Override

    public Dialog onCreateDialog(Bundle savedInstanceState) {

        final String[] BackgroundImg = {"Зеленый фон", "Красный фон", "Голубой фон"};

     //   ImageView imageView = (ImageView) findViewById(R.id.background_image);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Выберите цвет фона")
                // добавляем переключатели
                .setSingleChoiceItems(BackgroundImg, -1,
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog,
                                                int item) {
                                ImageView imageView = (ImageView) getActivity().findViewById(R.id.background_image);
                                switch (item)
                                {
                                    case 0:
                                        imageView.setImageResource(R.drawable.greenbackground);
                                        break;
                                    case 1:
                                        imageView.setImageResource(R.drawable.redbackground);
                                        break;
                                    case 2:
                                        imageView.setImageResource(R.drawable.bluebackground);
                                        break;

                                }

                            }
                        })
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // User clicked OK, so save the mSelectedItems results somewhere
                        // or return them to the component that opened the dialog
                        dialog.cancel();
                    }
                });

        return builder.create();
    }

}
