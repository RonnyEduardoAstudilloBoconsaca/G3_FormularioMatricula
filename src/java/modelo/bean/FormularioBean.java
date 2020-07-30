
package modelo.bean;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "formularioBean")
@RequestScoped
public class FormularioBean {
    private String email;
    private String tecnologias[];

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String[] getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(String[] tecnologias) {
        this.tecnologias = tecnologias;
    }
  
    
    public FormularioBean() {
    }
    
    
}
