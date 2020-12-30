import java.util.Date;

public class Person {
    private FullName fullName;  // Họ và tên
    private int dateOfBirth;  // Ngày Tháng năm sinh
    private String Occupation; // nghề nghiệp

    public Person() {
    }

    public Person(String fullName, int dateOfBirth, String Occupation) {
        this.setFullName(fullName);
        this.dateOfBirth = dateOfBirth;
        this.Occupation = Occupation;
    }

    public String getFullNameString() {
        return fullName.first + " " + fullName.last + " " + fullName.mid;
    }

    public void setFullName(String fullName) {
        this.fullName = new FullName();
        if (fullName != null && fullName.length() > 0) {
            var words = fullName.split("\\s+");
            this.fullName.first = words[words.length - 1];
            this.fullName.last = words[0];
            this.fullName.mid = "";
            for (int i = 1; i < words.length - 1; i++) {
                this.fullName.mid += words[i];
            }
        }
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }


    public String getOccupation() {
        return Occupation;
    }


    class FullName {
        private String first;
        private String last;
        private String mid;

        public FullName() {
        }
    }
}
