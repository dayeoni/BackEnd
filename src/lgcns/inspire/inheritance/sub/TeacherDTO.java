package lgcns.inspire.inheritance.sub;

import lgcns.inspire.inheritance.PersonDTO;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@ToString
public class TeacherDTO extends PersonDTO{
    
    private String subject;

    public String teaInfo() {
        return super.perInfo()+", subject="+subject;
    }

    @Override
    public String perInfo() {
        return super.perInfo()+", subject="+subject;
    }
    
}
