package ca.ualberta.cs.lonelytwitter;

<<<<<<< HEAD
=======
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;

>>>>>>> junit
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

<<<<<<< HEAD
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;

=======
>>>>>>> junit
public class LonelyTwitterActivity extends Activity {

	private static final String FILENAME = "file.sav";
//	Global variable and it does not have to do anything with the instance you make
	private EditText bodyText;
	private ListView oldTweetsList;

<<<<<<< HEAD

	private ArrayList<Tweet> tweets = new ArrayList<Tweet>();
	private ArrayAdapter<Tweet> adapter;
	
=======
	private ArrayList<Tweet> tweetList = new ArrayList<Tweet>();

	private ArrayAdapter<Tweet> adapter;

>>>>>>> junit
	/** Called when the activity is first created. */
	/**
	 * onCreate links between UI elements and controller
	 * @param savedInstanceState
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		bodyText = (EditText) findViewById(R.id.body);
		Button saveButton = (Button) findViewById(R.id.save);
		oldTweetsList = (ListView) findViewById(R.id.oldTweetsList);

		saveButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				setResult(RESULT_OK);
				String text = bodyText.getText().toString();
<<<<<<< HEAD
				try {
					tweets.add(new NormalTweet(text));
				} catch (TweetTooLongException e) {
					e.printStackTrace();
				}
				saveInFile();
				adapter.notifyDataSetChanged();
//				finish(); when you press finish, it closes the activity
=======
>>>>>>> junit

				Tweet newTweet = new NormalTweet(text);

				tweetList.add(newTweet);
				adapter.notifyDataSetChanged();

				saveInFile();
			}
		});
	}
	/**
	 * onStart loads tweets from the saved file
	 */

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
<<<<<<< HEAD
//		loadFromFile();
		if (tweets == null) {
			throw new RuntimeException();
		}
		adapter = new ArrayAdapter<Tweet>(this, R.layout.list_item, tweets);
		oldTweetsList.setAdapter(adapter);
	}
	/**
	 * loads tweets using the Gson library
	 */
=======
		loadFromFile();
		adapter = new ArrayAdapter<Tweet>(this,
				R.layout.list_item, tweetList);
		oldTweetsList.setAdapter(adapter);
	}

>>>>>>> junit
	private void loadFromFile() {
		try {
			FileInputStream fis = openFileInput(FILENAME);
			BufferedReader in = new BufferedReader(new InputStreamReader(fis));
<<<<<<< HEAD
			Gson gson = new Gson();
=======

			Gson gson = new Gson();

			// Code from http://stackoverflow.com/questions/12384064/gson-convert-from-json-to-a-typed-arraylistt
			Type listType = new TypeToken<ArrayList<NormalTweet>>(){}.getType();

			tweetList = gson.fromJson(in,listType);
>>>>>>> junit

			Type listType = new TypeToken<ArrayList<NormalTweet>>() {}.getType();
			tweets = gson.fromJson(in, listType);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
<<<<<<< HEAD
			tweets = new ArrayList<Tweet>();
		}
	}
	/**
	 * saves in file using the Json library
	 * @param text
	 * @param date
	 */
	private void saveInFile(String text, Date date) {
=======
			tweetList = new ArrayList<Tweet>();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
		}
	}
	
	private void saveInFile() {
>>>>>>> junit
		try {
			FileOutputStream fos = openFileOutput(FILENAME,
					0);

			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(fos));

			Gson gson = new Gson();
			gson.toJson(tweetList, out);
			out.flush();

			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
<<<<<<< HEAD
			tweets = new ArrayList<Tweet>();

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
        }
	}
	/**
	 * saves a file using the Json library
	 */
	private void saveInFile() {
		try {
			FileOutputStream fos = openFileOutput(FILENAME, Context.MODE_APPEND);
			OutputStreamWriter writer = new OutputStreamWriter(fos);
			Gson gson = new Gson();
			gson.toJson(tweets, writer);
			writer.flush();
			fos.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
=======
			throw new RuntimeException();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
>>>>>>> junit
		}
	}
	/**
	 * clears tweets
	 */
	private void clearTweets() {
		tweets.clear();
		adapter.notifyDataSetChanged();
		File dir = getFilesDir();
		File file = new File(dir, FILENAME);
		file.delete();

	}
//    Button save = (Button) findViewById(R.id.save);
    public void saveData(View view) {



    }
}