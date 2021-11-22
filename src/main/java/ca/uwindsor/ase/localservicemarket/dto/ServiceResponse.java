package ca.uwindsor.ase.localservicemarket.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ServiceResponse {
    private String userName;
    private String firstName;
    private String lastName;
    private String serviceName;
    private int rating;
    private String skill;
    private String imageUrl;

}
