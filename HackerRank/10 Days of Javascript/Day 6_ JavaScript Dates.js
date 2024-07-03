

// The days of the week are: "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
var getDayName = (dateString) => {
    const date = new Date(dateString);

    const options = {
      weekday: 'long'
    };
  
    return new Intl.DateTimeFormat('en-Us', options).format(date);
}

