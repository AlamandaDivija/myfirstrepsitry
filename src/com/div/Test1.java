package com.div;

public class Test1 {

	
		public static void main(String[] args)
			{
				int n=5,m=5;
				for(int i=0;i<n;i++)
				{
					//========== I ========
					for(int j=0;j<1;j++)
					{
						System.out.print("*  ");
					}
					//=========== N=============
					for(int j=0;j<m;j++)
					{
						if(j==0||j==(m-1)||i==j)
						{
							System.out.print(" *");
						}
						else
						{
							System.out.print("  ");
						}

					}
					//================ E =============
					for(int j=0;j<m;j++)
					{
						if(j==0||i==0||i==(n-1)||i==(n/2))
						{
							System.out.print(" *");
						}
						else
						{
							System.out.print("  ");
						}
					}
					//=============U ===========
					for(int j=0;j<m;j++)
					{
						if((j==0 || j==(m-1))&&i!=(n-1)||i==(n-1)&&(j!=0 &&j<(m-1)))
						{
							System.out.print("  *");
						}
						else
						{
							System.out.print("   ");
						}
					}
					//======== R =============
					for(int j=0;j<m;j++)
					{
						if(j==0 ||i==0||i==(n/2)||j==(m-1)&&i<=(n/2)||(i>(n/2)&&j>(n/2)&&i==j))
						{
							System.out.print(" *");
						}
						else
						{
							System.out.print("  ");
						}
					}
					//=====================
					for(int j=0;j<m;j++)
					{
						if((j==0 || j==(m-1))&&(i!=0&&i!=(n-1))||(i==0||i==(n-1))&&(j!=0&&j!=(m-1)))
						{
							System.out.print(" *");
						}
						else
						{
							System.out.print("  ");
						}
					}
					for(int j=0;j<m;j++)
					{
						if(j==0||j==(m-1)||i==j)
						{
							System.out.print(" *");
						}
						else
						{
							System.out.print("  ");
						}

					}
					System.out.println(" ");
				}

			}

		
	}


