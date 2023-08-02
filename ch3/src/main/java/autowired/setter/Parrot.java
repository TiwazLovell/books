package autowired.setter;

import org.springframework.stereotype.Component;

@Component
public class Parrot {

  private String name = "Setter Koko";

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
