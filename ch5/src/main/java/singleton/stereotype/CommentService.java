package singleton.stereotype;

import org.springframework.stereotype.Service;

@Service
public class CommentService {

  private final CommentRepository commentRepository;

//  @Autowired
//  private CommentRepository commentRepository;

//  better - the bean will be immutable
  public CommentService(CommentRepository commentRepository) {
    this.commentRepository = commentRepository;
  }

  public CommentRepository getCommentRepository() {
    return commentRepository;
  }
}
