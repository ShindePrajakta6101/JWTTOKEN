package entity;


import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;*/

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;  // <-- update import statement
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(unique = true)
    private String email;
    
    private String password;
   
    
    public String getEmail() {
        return email;
    }

    //private String email;

    //@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    //private String password;

	public CharSequence getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setPassword(String encodedPass) {
		// TODO Auto-generated method stub
		
	}

}

