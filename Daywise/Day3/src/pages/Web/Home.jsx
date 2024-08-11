import React from 'react'

import {
  Carousel,
  CarouselContent,
  CarouselItem,
  CarouselNext,
  CarouselPrevious,
} from "@/components/ui/carousel"

const Home = () => {
  return (
    <div className='h-full w-full flex justify-center items-center'>
    <Carousel>
  <CarouselContent>
    <CarouselItem><img src='https://blog.grabon.in/wp-content/uploads/2021/07/Online-Grocery-Stores-in-india.jpg' alt='slide1'></img></CarouselItem>
    <CarouselItem>...</CarouselItem>
    <CarouselItem>...</CarouselItem>
  </CarouselContent>
  <CarouselPrevious />
  <CarouselNext />
</Carousel>

</div>
  )
}

export default Home