from tkinter import Tk, Frame, YES, BOTH
from tkinter import *
import multiprocessing
from multiprocessing import Process
"""gui for the automatic service"""



class GUI(Frame):
    def __init__(self):
        Frame.__init__(self)
        self.pack(expand=YES, fill=BOTH)



    def load_main_window(self):
        ...


    







if __name__ == "__main__":
    GUI().mainloop()
