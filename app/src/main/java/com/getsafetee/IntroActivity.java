package com.getsafetee;

import android.Manifest;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.getsafetee.safetee.R;

import agency.tango.materialintroscreen.MaterialIntroActivity;
import agency.tango.materialintroscreen.MessageButtonBehaviour;
import agency.tango.materialintroscreen.SlideFragmentBuilder;

public class IntroActivity extends MaterialIntroActivity {

    @Override

    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        addSlide(new SlideFragmentBuilder()

                        .backgroundColor(R.color.colorPrimary)

                        .buttonsColor(R.color.colorAccent)

                        .image(R.drawable.cf)

                        .title("Get Help")

                        .description("Add your friends as emergency contacts")

                        .build(),

                new MessageButtonBehaviour(new View.OnClickListener() {

                    @Override

                    public void onClick(View v) {

                        Toast.makeText(IntroActivity.this, "", Toast.LENGTH_SHORT).show();

                    }

                }, ""));

        addSlide(new SlideFragmentBuilder()

                        .backgroundColor(R.color.colorPrimary)

                        .buttonsColor(R.color.colorAccent)

                        .image(R.drawable.pin)

                        .title("Pin Code")

                        .description("Protect your records")

                        .build(),

                new MessageButtonBehaviour(new View.OnClickListener() {

                    @Override

                    public void onClick(View v) {

                        Toast.makeText(IntroActivity.this, "", Toast.LENGTH_SHORT).show();

                    }

                }, ""));

        addSlide(new SlideFragmentBuilder()

                .backgroundColor(R.color.colorPrimary)

                .buttonsColor(R.color.colorAccent)

                .image(R.drawable.mic)

                .title("Record")

                .description("Provide evidence for law suit")

                .build());

        addSlide(new SlideFragmentBuilder()

                .backgroundColor(R.color.colorPrimary)

                .buttonsColor(R.color.colorAccent)

                .image(R.drawable.tips)

                .title("Tips")

                .description("Receive timely tips to keep you safe")

                .build());

        addSlide(new SlideFragmentBuilder()

                .backgroundColor(R.color.colorPrimary)

                .buttonsColor(R.color.colorAccent)

                .image(R.drawable.circle_of_friends)

                .title("Report")

                .description("Report as an eye witness")

                .build());

    }
}
