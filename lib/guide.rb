require 'restaurant'
class Guide
  class Config
    @@actions = ['list', 'find', 'add', 'quit']
    def self.actions; @@actions; end
  end
  
  def initialize(path=nil)
    # locate the restaurant text file at path
    Restaurant.filepath = path
    if Restaurant.file_usable?
      puts "Found restaurant file."
    # or create a new file
    elsif Restaurant.create_file
      puts "Created restaurant file."
    # exit if create fails
    else
      puts "Exiting.\n\n"
      exit!
    end
  end

  def launch!
    introduction
    # action loop
    result = nil
    until result == :quit
      action,args = get_action
      result = do_action(action,args)
    end
		conclusion
  end
  def Restaurant.saved_restaurants
    restaurants=Array.new
      File.open('restaurants.txt','r'){|file|
        file.each_line {|line|
          puts line
          restaurants << line
        }
      }
    return restaurants
  end

  def get_action
    action = nil
    # Keep asking for user input until we get a valid action
    until Guide::Config.actions.include?(action)
      puts "Actions: " + Guide::Config.actions.join(", ")
      print "> "
      user_response = gets.chomp
      args= user_response.downcase.strip.split(' ')
      action = user_response.downcase.strip
    end
    return action, args
  end
  def list 
    counter=0
    puts "\n Listing restaurants \n\n".upcase
    restaurants= Restaurant.saved_restaurants
    while restaurants.count < counter
      puts restaurants[counter]
      counter +=1
    end
  end

  def find(keyword="")
    puts("Find a restaurant")
    counter=0
    restaurants = Restaurant.saved_restaurants
    key=gets.chomp.downcase

    if restaurants.include?('key')
      puts "FOUND"
    else
      puts "NOT FOUND"
    end 
  end


  def do_action(action,args=[])
    case action
    when 'list'
      list()
    when 'find'
      puts 'Finding...'
      keyword =args.shift
      find(keyword)
    when 'add'
      add
    when 'quit'
      return :quit
    else
      puts "\nI don't understand that command.\n"
    end
  end
 
  def add
    puts "\nAdd a restaurant\n\n".upcase
    restaurant = Restaurant.new
    
    print "Restaurant name: "
    restaurant.name = gets.chomp.strip

    print "Cuisine type: "
    restaurant.cuisine = gets.chomp.strip
    
    print "Average price: "
    restaurant.price = gets.chomp.strip
    
    if restaurant.save
      puts "\nRestaurant Added\n\n"
    else
      puts "\nSave Error: Restaurant not added\n\n"
    end
    
  end
  
  def introduction
    puts "\n\n<<< Welcome to the Food Finder >>>\n\n"
    puts "This is an interactive guide to help you find the food you crave.\n\n"
  end

	def conclusion
  	puts "\n<<< Goodbye and Bon Appetit! >>>\n\n\n"
	end
	
end
