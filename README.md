# buildAWallOO

Create a function called build_a_wall (or buildAWall in Java) that takes x and y as integer arguments (which represent the number of rows of bricks for the wall and the number of bricks in each row respectively) and outputs the wall as a string with the following symbols:

■■ => One full brick (2 of ■)

■ => Half a brick

| => Mortar (between bricks on same row)

There has to be a | between every two bricks on the same row. For more stability each row's bricks cannot be aligned vertically with the bricks of the row above it or below it meaning at every 2 rows you will have to make the furthest brick on both sides of the row at the size of half a brick (■) while the first row from the bottom will only consist of full bricks. Starting from the top, every new row is to be represented with \n except from the bottom row. See the examples for a better understanding.

If one or both of the arguments aren't valid (less than 1, isn't integer, isn't given...etc) return None or null.

If the number of bricks required to build the wall is greater than 10000 return "Naah, too much...here's my resignation."

Examples, based on Python:

build_a_wall(5,5) => '■■|■■|■■|■■|■■\n■|■■|■■|■■|■■|■\n■■|■■|■■|■■|■■\n■|■■|■■|■■|■■|■\n■■|■■|■■|■■|■■'

build_a_wall(10,7) => '■|■■|■■|■■|■■|■■|■■|■\n■■|■■|■■|■■|■■|■■|■■\n■|■■|■■|■■|■■|■■|■■|■\n■■|■■|■■|■■|■■|■■|■■\n■|■■|■■|■■|■■|■■|■■|■\n■■|■■|■■|■■|■■|■■|■■\n■|■■|■■|■■|■■|■■|■■|■\n■■|■■|■■|■■|■■|■■|■■\n■|■■|■■|■■|■■|■■|■■|■\n■■|■■|■■|■■|■■|■■|■■'

build_a_wall("eight",[3]) => None  }
                                   }> Invalid input
build_a_wall(12,-4) => None        }

build_a_wall(123,987) => "Naah, too much...here's my resignation."

It could be a bit of overengineering, but try to approach the exercise having the OO principles and SOLID in mind.

You've three hours to achieve the task. After the exercise please compress all your code including any dependencies you used and send it back to me.