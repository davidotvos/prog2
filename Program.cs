using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace gyakorlas1
{
    class Program
    {
        static void Main(string[] args)
        {
            List<legok> l = new List<legok>();
            List<otherlegok> k = new List<otherlegok>();
            int n = Convert.ToInt32(Console.ReadLine());
            String[] data;
            for(int i = 0; i < n; i++)
            {
                data = Console.ReadLine().Split(';');
                l.Add(new legok(Convert.ToInt32(data[0]), data[1], data[2], Convert.ToInt32(data[3])));
                k.Add(new otherlegok(Convert.ToInt32(data[0]), data[1], data[2], Convert.ToInt32(data[3])));
            }
            l.Sort();
            k.Sort();
            foreach(legok m in l)
            {
                Console.WriteLine(m);
            }
            Console.WriteLine();
            foreach (otherlegok m in k)
            {
                Console.WriteLine(m);
            }
        }
    }

    class otherlegok : IComparable<otherlegok>
    {
        int id;

        String settname;

        String themename;

        int quantity;

        public otherlegok(int id, string settname, string themename, int quantity)
        {
            this.id = id;
            this.settname = settname;
            this.themename = themename;
            this.quantity = quantity;
        }


        public int CompareTo(otherlegok other)
        {
            int res = themename.CompareTo(other.themename);
            if (res == 0)
            {
                res = settname.CompareTo(other.settname);
                if (res == 0)
                {
                    res = id.CompareTo(other.id);  
                }
            }
            return res;
        }

        

        public override string ToString()
        {
            return settname + " (" + id + "): " + quantity + " - " + themename;
        }


    }

    class legok : IComparable<legok>
    {
        int id;

        String settname;

        String themename;

        int quantity;

        public legok(int id, string settname, string themename, int quantity)
        {
            this.id = id;
            this.settname = settname;
            this.themename = themename;
            this.quantity = quantity;
        }


        public int CompareTo(legok other)
        {
            int res = other.quantity.CompareTo(quantity);
            if(res == 0)
            {
                res = themename.CompareTo(other.themename);
                if(res == 0)
                {
                    res = settname.CompareTo(other.settname);
                    if(res == 0)
                    {
                        res = id.CompareTo(other.id);
                    }
                }
            }
            return res;
        }

        public override string ToString()
        {
            return settname + " (" + id + "): " + quantity + " - " + themename;
        }

        
    }
}
