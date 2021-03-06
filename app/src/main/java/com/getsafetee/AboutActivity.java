package com.getsafetee;

import android.support.annotation.Nullable;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.getsafetee.safetee.R;

import agency.tango.materialintroscreen.MaterialIntroActivity;
import agency.tango.materialintroscreen.MessageButtonBehaviour;
import agency.tango.materialintroscreen.SlideFragmentBuilder;

public class AboutActivity extends MaterialIntroActivity {

    @Override

    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        addSlide(new SlideFragmentBuilder()

                        .backgroundColor(R.color.colorGrey)

                        .buttonsColor(R.color.colorAccent)

                        .image(R.drawable.logo)


                        .title("Safetee")

                        .description("A safety app")

                        .build(),

                new MessageButtonBehaviour(new View.OnClickListener() {

                    @Override

                    public void onClick(View v) {

                        Toast.makeText(AboutActivity.this, "", Toast.LENGTH_SHORT).show();

                    }

                }, ""));

        addSlide(new SlideFragmentBuilder()

                        .backgroundColor(R.color.colorGrey)

                        .buttonsColor(R.color.colorAccent)

                        .image(R.drawable.cchub_nigeria)

                        .title("Co-Creation Hub")

                        .description("Safetee is supported by the Co-Creation Hub")

                        .build(),

                new MessageButtonBehaviour(new View.OnClickListener() {

                    @Override

                    public void onClick(View v) {

                        Toast.makeText(AboutActivity.this, "", Toast.LENGTH_SHORT).show();

                    }

                }, ""));


    }
}
