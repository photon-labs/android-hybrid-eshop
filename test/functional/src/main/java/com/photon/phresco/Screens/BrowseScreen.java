package com.photon.phresco.Screens;

import com.photon.phresco.uiconstants.MobilewidgUiConstants;

public class BrowseScreen {
	private MobilewidgUiConstants mobilewidgUiConstants;

	public BrowseScreen(MobilewidgUiConstants mobilewidgUiConstants) {
		this.mobilewidgUiConstants = mobilewidgUiConstants;
	}

	public TelevisionScreen gotoTelevisioScreen(String currentTestMethodName) {
		return new TelevisionScreen(mobilewidgUiConstants,
				currentTestMethodName);
	}

	public MP3PlayersScreen gotoMP3PlayersScreen(String currentTestMethodName) {
		return new MP3PlayersScreen(mobilewidgUiConstants,
				currentTestMethodName);
	}

	public ComputersScreen gotoComputersScreen(String currentTestMethodName) {
		return new ComputersScreen(mobilewidgUiConstants,
				currentTestMethodName);
	}

	public MobilePhonesScreen gotoMobilePhonesScreen(String currentTestMethodName) {
		return new MobilePhonesScreen(mobilewidgUiConstants,
				currentTestMethodName);
	}

	public VideoGamesScreen gotoVideoGamesScreen(String currentTestMethodName) {
		return new VideoGamesScreen(mobilewidgUiConstants,
				currentTestMethodName);
	}
	public TabletsScreen gotoTabletsScreen(String currentTestMethodName) {
		return new TabletsScreen(mobilewidgUiConstants,
				currentTestMethodName);
	}
	public MoviesAndMusicScreen gotomoMoviesAndMusicScreen(String currentTestMethodName) {
		return new MoviesAndMusicScreen(mobilewidgUiConstants,
				currentTestMethodName);
	}
	public CamerasScreen gotoCamerasScreen(String currentTestMethodName) {
		return new CamerasScreen(mobilewidgUiConstants,
				currentTestMethodName);
	}
	public AudioDevicesScreen gotoAudioDevicesScreen(String currentTestMethodName) {
		return new AudioDevicesScreen(mobilewidgUiConstants,
				currentTestMethodName);
	}
	public AccessoriesScreen gotoAccessoriesScreen(String currentTestMethodName) {
		return new AccessoriesScreen(mobilewidgUiConstants,
				currentTestMethodName);
	}
}
