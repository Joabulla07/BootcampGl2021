package com.joanna.database;

import java.util.ArrayList;
import java.util.List;

import com.joanna.Model.Egg;
import com.joanna.Model.EggsCarton;
import com.joanna.Model.Farmer;
import com.joanna.Model.Hen;
import org.springframework.stereotype.Component;

@Component
public class DataFarm {

  public static List<Farmer> farmers = new ArrayList<Farmer>();

  public static List<EggsCarton> eggsCartons = new ArrayList();

  public static List<Hen> hens = new ArrayList();

  public static List<Egg> eggs = new ArrayList();

  public static int redHen = 0;

  public static int whiteHen = 0;

}
