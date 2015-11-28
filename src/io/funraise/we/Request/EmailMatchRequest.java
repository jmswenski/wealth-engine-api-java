package io.funraise.we.Request;

public class EmailMatchRequest extends MatchRequest {
    
    public String email;
 
    public boolean validate() {
        return super.validate() && notEmpty(email);
    }
}
