

	public class Entity {
		private String firstName;
		private String lastName;
		private String entityType;
		public Entity(String first, String last, String type) {
			firstName = first;
			lastName = last;
			entityType = type;
		}	
		
		/*
		 * These are getter (accessor) methods.
		 */
		public String getFirstName() {
			return firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
		
		public String getEntityType() {
			return entityType;
		}
		
		/*
		 * This method prints out some general information about the person
		 */
		public void getEntityInfo() {
			System.out.println(firstName + " " + lastName + " is a " + entityType);
		}
		
	}

