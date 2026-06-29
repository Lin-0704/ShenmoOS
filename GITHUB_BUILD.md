# ShenmoOS GitHub Build

This repository can build a debug APK with GitHub Actions.

## How to run

1. Open the Actions tab.
2. Choose the Build workflow.
3. Click Run workflow.
4. After it succeeds, download the artifact named `ShenmoOS-debug-apk`.
5. Extract it and install `app-debug.apk` on an Android phone.

## Current starter scope

The first build is intentionally tiny. It proves that the native Android project and the cloud build route work. The launcher, chat, local memory, bill import, focus mode, voice, device control and health modules will be expanded after the APK pipeline is stable.
