package instantiation.eager;

import org.springframework.stereotype.Service;

@Service
public class CommentService {

  public CommentService() {
    System.out.println("CommentService instance created!");
  }
}
