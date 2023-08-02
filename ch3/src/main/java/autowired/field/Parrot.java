package autowired.field;

import org.springframework.stereotype.Component;

@Component
public class Parrot {

  private String name = "Koko field";

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "first.Parrot : " + name;
  }
}
