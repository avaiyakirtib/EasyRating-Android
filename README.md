EasyRating-Android
==================

Android library for displaying a "rate this app"dialog  on google play store  with auto disabling and auto manage dialog appearance 

Using

The main flow usage is:

Create dialog in your main activity or your start activity:

public void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  easyRatingDialog = new EasyRatingDialog(this);
}

Tips

Condition triggers
for custiomize the popup behaviour 
If you want to change the default lib behavior you can create a custom Condition Trigger:

EasyRatingDialog.ConditionTrigger conditionTrigger = new EasyRatingDialog.ConditionTrigger() {
  @Override
  public boolean shouldShow() {
    //Your custom condition here
    return false;
  }
};

easyRatingDialog.setConditionTrigger(conditionTrigger);

License

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
