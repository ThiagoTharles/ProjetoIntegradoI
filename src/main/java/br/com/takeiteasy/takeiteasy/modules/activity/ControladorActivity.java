package main.java.br.com.takeiteasy.takeiteasy.modules.activity;

import java.util.*;

public class ControladorActivity {

  private List<Activity> activityLista;

  ControladorActivity() {
    activityLista = new ArrayList<Activity>();
  }

  /**
   * @return the List<Activity>
   */
  public List<Activity> getActivity() {
    return activityLista;
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
