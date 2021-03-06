package emp.portal.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(
        name = "AboutMe")
public class AboutMe {
			
	 	@Id
	    @Column(
	    		name="Emp_Email"
	    		)
	    private String empEmail;
	 
		    @Column(
		    		name="Name"
		    		)
		    
		    private String Name;

		    @Column(
		    		name="Emp_PhoneNo"
		    		)
		    private long empPhoneNo;
		    
		    @Column(
		    		name="Experience"
		    		)
		    private int  empExp;
		    
		    @Column(
		    		name="NL_Experience"
		    		)
		    private int  empNLExp;
		    
		    @Column(
		    		name="About_Me"
		    		)
		    private String  empAboutMe;
		    
//		    @Column(
//		    		name="Skills"
//		    		)
//		    private ArrayList<String>  empSkills;
		    
		    
		    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
		    @JoinTable(name = "user_skills",
		        joinColumns = @JoinColumn(name = "email", referencedColumnName = "Emp_Email"),
		        inverseJoinColumns = @JoinColumn(name = "skills_id", referencedColumnName = "title"))
		    

		    
		    
//		    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval=true)
//		    @JoinTable(name = "user_skills",
//		        joinColumns = @JoinColumn(name = "email", referencedColumnName = "Emp_Email"),
//		        inverseJoinColumns = @JoinColumn(name = "skills_id", referencedColumnName = "title"))
//		    
		     private Set<SkillSet> skills;
		    
		    public void addSkills(SkillSet skillSet) {
		        skills.add(skillSet);
		    }

		    public void removeRoles(SkillSet skillSet) {
		        skills.remove(skillSet);
		    }
		    
		    
		    public Set<SkillSet> getSkills() {
				return skills;
			}

			public void setSkills(Set<SkillSet> skills) {
				this.skills = skills;}
			
			public AboutMe() {}

			public AboutMe(String Name,  String empEmail, long empPhoneNo, int empExp,
					int empNLExp, String empAboutMe) {
				this.Name = Name;
				this.empEmail = empEmail;
				this.empPhoneNo = empPhoneNo;
				this.empExp = empExp;
				this.empNLExp = empNLExp;
				this.empAboutMe = empAboutMe;
			}

			public String getName() {
				return Name;
			}

			public void setName(String firstName) {
				this.Name = firstName;
			}

			public String getEmpEmail() {
				return empEmail;
			}

			public void setEmpEmail(String empEmail) {
				this.empEmail = empEmail;
			}

			public long getEmpPhoneNo() {
				return empPhoneNo;
			}

			public void setEmpPhoneNo(long empPhoneNo) {
				this.empPhoneNo = empPhoneNo;
			}

			public int getEmpExp() {
				return empExp;
			}

			public void setEmpExp(int empExp) {
				this.empExp = empExp;
			}

			public int getEmpNLExp() {
				return empNLExp;
			}

			public void setEmpNLExp(int empNLExp) {
				this.empNLExp = empNLExp;
			}

			public String getEmpAboutMe() {
				return empAboutMe;
			}

			public void setEmpAboutMe(String empAboutMe) {
				this.empAboutMe = empAboutMe;
			}
			
			
			
//			public void removeSkill(SkillSet skillSet) {
//				this.skills.remove(skillSet);
//			}
			
//		    public void removeSkillSet(SkillSet b) {
//		        skills.remove(b);
//		    }  
		}

