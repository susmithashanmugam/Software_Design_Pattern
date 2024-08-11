import { Facebook, Instagram, Linkedin, Twitter, Youtube } from 'lucide-react'
import React from 'react'
import { Link } from 'react-router-dom'

const Footer = () => {
  return (
    <footer className="bg-gray-100 py-10 text-black shadow-lg shadow-gray-500 overflow-hidden">
      <div className="footer-content max-w-[1200px] mx-auto flex flex-wrap justify-between">
        <div className="footer-section w-full sm:w-1/3 text-black text-2xl mb-4 sm:mb-0 text-base leading-relaxed">
          <h2>About Us</h2>
          <p>Welcome to Your Personal Store, your one-stop destination for unique and thoughtful gifts. Explore our curated collection designed to make every occasion special.</p>
        </div>
        <div className="footer-section w-full sm:w-auto mb-4 sm:mb-0">
          <h2>Quick Links</h2>
          <ul className="list-none p-0">
            <li className="text-black no-underline"><Link to='/'>Home</Link></li>
            <li className="text-black no-underline"><Link to='/shop'>Shop</Link></li>
            <li className="text-black no-underline"><Link to='/occasions'>Occasions</Link></li>
            <li className="text-black no-underline"><Link to='/contact'>Contact Us</Link></li>
          </ul>
        </div>
        <div className="footer-section w-full sm:w-1/3 mt-4 sm:mt-0">
          <h2>Contact Us</h2>
          <p>Email: info@yourgiftshop.com</p>
          <p>Phone: 7880563295</p>
          <p>Address: Coimbatore</p>
          <div className="flex gap-2 mt-2">
            <a href="https://instagram.com" target="_blank" rel="noopener noreferrer" className="text-black">
              <Instagram className='h-6 w-6' />
            </a>
            <a href="https://facebook.com" target="_blank" rel="noopener noreferrer" className="text-black">
              <Facebook className='h-6 w-6' />
            </a>
            <a href="https://youtube.com" target="_blank" rel="noopener noreferrer" className="text-black">
              <Youtube className='h-6 w-6' />
            </a>
            <a href="https://twitter.com" target="_blank" rel="noopener noreferrer" className="text-black">
              <Twitter className='h-6 w-6' />
            </a>
            <a href="https://linkedin.com" target="_blank" rel="noopener noreferrer" className="text-black">
              <Linkedin className='h-6 w-6' />
            </a>
          </div>
        </div>
      </div>
      <div className="footer-bottom mt-5 text-center pt-2 border-t border-gray-300">
        <p className='text-sm text-black'>Copyright © 2023-2025 Smart Shopp Groceries Pvt Ltd</p>
      </div>
    </footer>
  )
}

export default Footer
