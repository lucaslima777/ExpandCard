
package com.example.lucaslima.expandcard;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class MainActivity extends Activity {

	ImageView facebook, github, linkedin;
	String facebook_link = "https://www.facebook.com/people/Lucas-Lima/100004399720527";
	String linkedin_link = "https://linkedin.com/in/lucas-lima-torre";
	String github_link = "https://github.com/lucaslima777";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_linearlayout);
		final ExpandableLayout expandableLayout = (ExpandableLayout) this
				.findViewById(R.id.expandablelayout);

		facebook = findViewById(R.id.facebook);
		github = findViewById(R.id.github);
		linkedin = findViewById(R.id.linkedin);


		this.findViewById(R.id.button_expand).setOnClickListener(
				new OnClickListener() {
					@Override
					public void onClick(View v) {
						expandableLayout.toggleExpansion();
					}
				});

		Links(expandableLayout);

	}

	public void Links(final ExpandableLayout expandableLayout){

		this.findViewById(R.id.facebook).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent= new Intent(Intent.ACTION_VIEW,Uri.parse(facebook_link));
				startActivity(intent);
				expandableLayout.toggleExpansion();
			}
		});

		this.findViewById(R.id.linkedin).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent= new Intent(Intent.ACTION_VIEW,Uri.parse(linkedin_link));
				startActivity(intent);
				expandableLayout.toggleExpansion();
			}
		});

		this.findViewById(R.id.github).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent= new Intent(Intent.ACTION_VIEW,Uri.parse(github_link));
				startActivity(intent);
				expandableLayout.toggleExpansion();
			}
		});

	}

}
