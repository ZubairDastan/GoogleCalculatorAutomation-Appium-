# GoogleCalculatorAutomation-Appium-
This is a QA project in which I have automated an android app named 'Calculator' for testing. I used appium server for automating this app.

## How to run
1. Install appium server in you pc
2. Connect a phone with pc.
3. Open the appium server and start.
4. Open inspector tool. Set the desired capabilities and save it
5. Select the saved desired capablities from 'Saved capability Sets' tab and click start server.
6. Clone the project in local pc.
7. Open terminal from the directory.
8. Run `gradle clean test`

### Attachment
Desired capabilities
```
  {
  "appium:deviceName": "My Device",
  "appium:uuid": "abd id from cmd",
  "platformName": "Android",
  "appium:platformVersion": "11",
  "appium:appPackage": "com.google.android.calculator",
  "appium:appActivity": "com.android.calculator2.Calculator"
  }
```
