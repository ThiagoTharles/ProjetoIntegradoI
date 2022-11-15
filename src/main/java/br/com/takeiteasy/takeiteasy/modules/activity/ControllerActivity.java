package br.com.takeiteasy.takeiteasy.modules.activity;

import java.util.*;

public class ControllerActivity {

  private List<Activity> activityLista;

  ControllerActivity() {
    activityLista = new ArrayList<Activity>();
  }

  /**
   * @return the List<Activity>
   */
  public List<Activity> getActivity() {
    return activityLista;
  }
  //CREATE A INTERFACEACTIVITY TO USE THIS FOLLOWING
  public String toString() {
    for (Activity activity : activityLista) {
      
    }
    return null;
  }
  public void addActivity(Activity activity) {
    this.activityLista.add(activity);
  }

  public void removeActivity(Activity activity) {
    activityLista.remove(activity);
  }

  public List<Activity> listActivity() {
    return activityLista;
  }

  public void updateActivity(Activity activity) {
    try {
      activityLista.set(activityLista.indexOf(activity), activity);
    } catch (Exception e) {

    }
  }
}
