Download the driver here: https://bitbucket.org/xerial/sqlite-jdbc/downloads/

  Setup:

```
import calculator.models.dbUtilities.*;
public class Test extends SQLDriver{
  

}

```

To create a table or open a connection to an existing table:

```
SQLDriver driver = new SQLDriver();
String [] columns = {"amount", "rate", "years"};
DBTypes [] full_types = {new DBTypes("double"), new DBTypes("double"), new DBTypes("real")};
try{
   driver.create_table("mortgages", "mortgages.db", columns, full_types);
}
catch(Exception e){
   //pass
}
```

To insert a row into a database:

```
DBValue [] all_vals = {new DBValue<Double>(amount), new DBValue<Double>(rate), new DBValue<Integer>(years)};
driver.insert_vals("mortgages", "mortgages.db", all_vals);

```


To select:

```
for (HashMap<String, ReturnedValue> val: driver.select_all("mortgages.db", "mortgages")){

  System.out.println(val.get("amount").to_double());
  System.out.println(val.get("rate").to_double());
  System.out.println(val.get("years").to_double());
}

```
